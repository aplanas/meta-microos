SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python39-Gloo-0.1.2-3.7.noarch.rpm"
RPM_HASH = "1ad33041a6e6afaf4169b38975250676901aea80df3c7deb618f9cc3f35cba62d2438ac8c8e519c527d025c864477757d36bb1766ca7a9546d5a925d5c3e3b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gloo) python39-Gloo python3dist(gloo)"
RDEPENDS:${PN} += "python(abi) python39-pandas"

inherit rpm
