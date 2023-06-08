SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python310-PasteDeploy-2.1.1+git.1652668078.0f0697d-1.9.noarch.rpm"
RPM_HASH = "d725ddfcc78bff7c50d0a1937f0f24c3fdf1a330777cb45e9e6974b993289f49610f45738ae33abc6a7fad74321f63bd201547c0c6aa1d36f244900f6525ba5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PasteDeploy python3-pastedeploy python3.10dist(pastedeploy) python310-PasteDeploy python310-pastedeploy python3dist(pastedeploy)"
RDEPENDS:${PN} += "python(abi) python310-Paste python310-setuptools"

inherit rpm
