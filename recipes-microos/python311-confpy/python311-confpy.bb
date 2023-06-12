SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-confpy-0.11.0-1.12.noarch.rpm"
RPM_HASH = "a38e047be7923cfd2684d2bda83638514218a7a2f5482238ce901d823c08688fae288440bb18d33c0cd8a3b9434dc753c0f3cb5d2722939f0b57ab9de4074eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(confpy) \
python311-confpy \
python3dist(confpy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi)"

inherit rpm
