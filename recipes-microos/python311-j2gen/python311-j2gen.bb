SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-j2gen-0.1.0-3.9.noarch.rpm"
RPM_HASH = "54e7f561057687bf8c2c56f4331d65e64583f43e4b85669e23c8a2b5588470dd9b177d00a5f2d2917b4350d44de07fdc4488447e6ce95a896e65ff4915eb3029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(j2gen) python311-j2gen python3dist(j2gen)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-PyYAML update-alternatives"

inherit rpm
