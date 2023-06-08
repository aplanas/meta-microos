SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python310-python-pam-1.8.4-1.15.noarch.rpm"
RPM_HASH = "3f8821d0f024069781596e8978ac557bf018463bea5b6f06450f0b5d6a88e3f9a4e97ae337da516d392fa456671a683ff2c71ed0f86b546dea080aadc99ae934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pam python3.10dist(python-pam) python310-python-pam python3dist(python-pam)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
