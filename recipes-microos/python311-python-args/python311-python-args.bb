SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python311-python-args-1.0.2-1.11.noarch.rpm"
RPM_HASH = "bad892fa1e8efba3f10003674a6525fc30a6d4563e74b74ed69f1088a05d3ebc177910dc73608e69375569f98e0ec284578d9a897c87594057f933b4bef51ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-args) \
python311-python-args \
python3dist(python-args)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
