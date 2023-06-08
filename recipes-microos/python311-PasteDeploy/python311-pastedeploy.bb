SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python311-PasteDeploy-2.1.1+git.1652668078.0f0697d-1.9.noarch.rpm"
RPM_HASH = "b27b5f2c6ef8832aa3b590309d07d6485384b8fe70bf006162c669c8fd6231ecdd8f973afee82266eb3652d369c4f6ffcb89b41571eadb936914d68a384c7669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pastedeploy) python311-PasteDeploy python311-pastedeploy python3dist(pastedeploy)"
RDEPENDS:${PN} += "python(abi) python311-Paste python311-setuptools"

inherit rpm
