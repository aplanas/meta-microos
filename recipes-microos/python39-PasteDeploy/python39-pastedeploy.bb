SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python39-PasteDeploy-2.1.1+git.1652668078.0f0697d-1.9.noarch.rpm"
RPM_HASH = "fafd0c6408f97bcc32b3baa0e2f3088e9ed06bdad3ad09661598c2317e5d3c11b3ac3568619537b112d9b03b457a672ac2c7cd4cf0353b289060357286e695c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pastedeploy) python39-PasteDeploy python39-pastedeploy python3dist(pastedeploy)"
RDEPENDS:${PN} += "python(abi) python39-Paste python39-setuptools"

inherit rpm
