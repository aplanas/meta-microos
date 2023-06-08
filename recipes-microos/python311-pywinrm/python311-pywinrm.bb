SUMMARY = "Python library for Windows Remote Management"
DESCRIPTION = "pywinrm is a Python client for Windows Remote Management (WinRM). This \
allows you to invoke commands on target Windows machines from any \
machine that can run Python. \
 \
WinRM allows you to call native objects in Windows. This includes, but \
is not limited to, running batch scripts, powershell scripts and \
fetching WMI variables. For more information on WinRM, please visit \
Microsoft's WinRM http://msdn.microsoft.com/en-us/library/aa384426.aspx"
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python311-pywinrm-0.4.3-1.5.noarch.rpm"
RPM_HASH = "94268b375554cbcf94e289987242791f69ca5ddda5e8ffab92da45bd271b57bdd6945b3c5deeacffffcbc0f253f65eead8a69d3c58cd78988705ef9c668fd0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywinrm) python311-pywinrm python3dist(pywinrm)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-requests_ntlm python311-six python311-xmltodict"

inherit rpm
