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

RPM_NAME = "python39-pywinrm-0.4.3-1.5.noarch.rpm"
RPM_HASH = "67adce06367ef6279a222fc082964b26b30c6dc49eeb2278a24bbbe97671596961bd9d0229733577bc361d785ac102101751253c2607eb036b26ddb3c85e94fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywinrm) python39-pywinrm python3dist(pywinrm)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-requests_ntlm python39-six python39-xmltodict"

inherit rpm
