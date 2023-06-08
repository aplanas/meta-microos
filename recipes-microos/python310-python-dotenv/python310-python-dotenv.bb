SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-python-dotenv-1.0.0-1.1.noarch.rpm"
RPM_HASH = "a3984447e9ef760d779eaed9559a660ae128b06f7d8a6d2db799f59e9a978470dbfa9d6994a24bb729692d7101039f698763788fe9eabc0fc8547a53411462a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-dotenv python3.10dist(python-dotenv) python310-python-dotenv python3dist(python-dotenv)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click update-alternatives"

inherit rpm
