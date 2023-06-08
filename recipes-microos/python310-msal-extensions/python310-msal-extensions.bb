SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-msal-extensions-1.0.0-2.1.noarch.rpm"
RPM_HASH = "a2f318826cdab8b2f33b17b0b77afcc0f8df3f07c31ed790e9e6d4413d29652bed698b67ec1a5a302ced4cb931cd28146d1c4db3cabd1f0b6f17041b523b19a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal-extensions python3.10dist(msal-extensions) python310-msal-extensions python3dist(msal-extensions)"
RDEPENDS:${PN} += "python(abi) python310-msal python310-portalocker"

inherit rpm
