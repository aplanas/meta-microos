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

RPM_NAME = "python310-pywinrm-0.4.3-1.5.noarch.rpm"
RPM_HASH = "fd9647d04d4801a7d2f2b733900bde3e04de4d3cc2f6b9b668dc901ae35a9c45a00ec63756cfa1e89bfe8fc6a6ce84422725f97a9135ebd10b62ce20baa8cb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywinrm python3.10dist(pywinrm) python310-pywinrm python3dist(pywinrm)"
RDEPENDS:${PN} += "python(abi) python310-requests python310-requests_ntlm python310-six python310-xmltodict"

inherit rpm
