SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python310-whitenoise-6.2.0-1.3.noarch.rpm"
RPM_HASH = "081276e1f21c4b18b234226250145ce83e8cb04d7f54e6662410b7a88ed91ba750495ada61bf348ffec9aec47c45ae832b5d31958d8806c1277fb93a95d73ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whitenoise python3.10dist(whitenoise) python310-whitenoise python3dist(whitenoise)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
