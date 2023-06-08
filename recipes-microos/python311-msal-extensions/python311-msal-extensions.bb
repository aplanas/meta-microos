SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-msal-extensions-1.0.0-2.1.noarch.rpm"
RPM_HASH = "580bb554a5e4f3da5f859f44f2beb8d3b42eb795bb7c17ff4b448b3fd80ff12e74bd418b6f475ec41ee56e0af31f201e4e9214f45be7e849bde60e89a4c445e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msal-extensions) python311-msal-extensions python3dist(msal-extensions)"
RDEPENDS:${PN} += "python(abi) python311-msal python311-portalocker"

inherit rpm
