SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-j2gen-0.1.0-3.9.noarch.rpm"
RPM_HASH = "165649e2e24a2e77702793d8a4b3efeaebaaac81a88129401ba045af901fabde316ced107106c314027facb5097dff6a5e9a9066c41b264e0f960904a5b52953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(j2gen) python39-j2gen python3dist(j2gen)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Jinja2 python39-PyYAML update-alternatives"

inherit rpm
