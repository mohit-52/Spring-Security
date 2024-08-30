Spring Security
Overview
Stateless authentication using JWT
Secure RESTful endpoints
Role-based access control
Custom authentication and authorization filters


Authentication: Verifying the identity of a user. Spring Security supports multiple authentication methods, such as form-based login, HTTP Basic, OAuth2, LDAP, JWT, etc.

Authorization: Determining if a user has permission to access a resource. This involves roles and permissions that can be configured to restrict access to specific endpoints or methods.

Filters: Spring Security uses a chain of filters to intercept requests and apply security checks. The most important filter is UsernamePasswordAuthenticationFilter for form-based authentication.

SecurityContext: Holds the details of the authenticated user. It is used across the application to check the user's identity and roles.

CsrfProtection: Prevents Cross-Site Request Forgery (CSRF) attacks, which trick authenticated users into submitting requests they didn't intend to.

JWT : JSON Web Tokens (JWT) are a compact, URL-safe means of representing claims to be transferred between two parties. In Spring Security, JWT is often used for securing RESTful services where sessions are stateless.
