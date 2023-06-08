SUMMARY = "Documentation for python-flup"
DESCRIPTION = "This package contains HTML documentation for python-flup."
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python-flup-doc-1.0.3.dev20161029-2.20.noarch.rpm"
RPM_HASH = "d481381188d9a646a2efafbcdaea3500cc99f7c840f2ee1f645910458dfd765565931dfb20a5d20c73e62e20451c6ac8b1f4bf6891559f48bdf70601d5c54ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flup-doc python310-flup-doc python311-flup-doc python39-flup-doc"
RDEPENDS:${PN} += ""

inherit rpm
