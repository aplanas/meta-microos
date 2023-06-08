SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "python310-django-oauth-toolkit-1.7.0-1.6.noarch.rpm"
RPM_HASH = "df69df3806ee303683a131471c42fc836cc33cff99a1c83e3e06e92759d77190d9c9d01990f8cac46ab97066a52e858a173d60c43d6be6ef133bee49d403026d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oauth-toolkit python3.10dist(django-oauth-toolkit) python310-django-oauth-toolkit python3dist(django-oauth-toolkit)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-jwcrypto python310-oauthlib python310-requests"

inherit rpm
