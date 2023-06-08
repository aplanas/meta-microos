SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python311-msal-1.22.0-1.1.noarch.rpm"
RPM_HASH = "c22ff8d019fd488f8afce8f1908060546df0e3792e5b0abc0bdaf980bec01fdbee148577752144c9920d7d2798fde45bcd1a303e50bff91797f2f666e53e3b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msal) python311-msal python3dist(msal)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-cryptography python311-requests"

inherit rpm
