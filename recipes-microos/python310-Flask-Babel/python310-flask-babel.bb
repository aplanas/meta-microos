SUMMARY = "i18n and l10n support for Flask"
DESCRIPTION = "This module implements i18n and l10n support for Flask. It is based on \
the Python babel module as well as pytz."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python310-Flask-Babel-2.0.0-1.11.noarch.rpm"
RPM_HASH = "c124dd2f7affac86141fd9aec5bfa5582892d37f3e6b9f0339b52aca88c17ac1a82ba771a6b80f5a3fef3e69dd7b41507004e1b956c98ced628013e05dec3352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Babel python3.10dist(flask-babel) python310-Flask-Babel python3dist(flask-babel)"
RDEPENDS:${PN} += "python(abi) python310-Babel python310-Flask python310-Jinja2 python310-pytz"

inherit rpm
