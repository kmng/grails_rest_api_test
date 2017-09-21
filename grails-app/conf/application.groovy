

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'todo1.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'todo1.UserRole'
grails.plugin.springsecurity.authority.className = 'todo1.Role'
grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"
grails.plugin.springsecurity.interceptUrlMap = [
    [pattern: '/',               access: ['permitAll']],
    [pattern: '/error',          access: ['permitAll']],
    [pattern: '/index',          access: ['permitAll']],
    [pattern: '/index.gsp',      access: ['permitAll']],
    [pattern: '/shutdown',       access: ['permitAll']],
    [pattern: '/assets/**',      access: ['permitAll']],
    [pattern: '/**/js/**',       access: ['permitAll']],
    [pattern: '/**/css/**',      access: ['permitAll']],
    [pattern: '/**/images/**',   access: ['permitAll']],
    [pattern: '/**/favicon.ico', access: ['permitAll']],
    [pattern: '/api/login',          access: ['permitAll']],
    [pattern: '/api/logout',        access: ['isFullyAuthenticated()']],
    [pattern: '/api/todos',    access: ['isFullyAuthenticated()']],
    [pattern: '/api/todos/**',    access: ['isFullyAuthenticated()']],
    [pattern: '/**',             access: ['permitAll']],
]

grails.plugin.springsecurity.filterChain.chainMap = [
    [pattern: '/api/**', filters:'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter'],
    [pattern: '/**', filters:'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]


rails.plugin.springsecurity.rest.login.active=true
grails.plugin.springsecurity.rest.login.endpointUrl='/api/login'
grails.plugin.springsecurity.rest.login.failureStatusCode=401
grails.plugin.springsecurity.rest.login.useJsonCredentials=true
grails.plugin.springsecurity.rest.login.usernamePropertyName='username'
grails.plugin.springsecurity.rest.login.passwordPropertyName='password'
grails.plugin.springsecurity.rest.token.storage.useGorm=true
grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName='todo1.AuthenticationToken'
grails.plugin.springsecurity.rest.token.storage.gorm.tokenValuePropertyName='tokenValue'
grails.plugin.springsecurity.rest.token.storage.gorm.usernamePropertyName='username'
grails.plugin.springsecurity.rest.token.generation.useSecureRandom=true
grails.plugin.springsecurity.rest.token.generation.useUUID=false
grails.plugin.springsecurity.rest.token.validation.active=true
grails.plugin.springsecurity.rest.token.validation.endpointUrl='/api/validate'
grails.plugin.springsecurity.password.algorithm = 'SHA-256'
grails.plugin.springsecurity.password.hash.iterations = 1
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
grails.plugin.springsecurity.rest.logout.endpointUrl='/api/logout'
