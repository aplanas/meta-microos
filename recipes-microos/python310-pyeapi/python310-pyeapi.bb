SUMMARY = "Python Client for eAPI"
DESCRIPTION = "The Python Client for eAPI (pyeapi) is a native Python library wrapper around \
Arista EOS eAPI.  It provides a set of Python language bindings for configuring \
Arista EOS nodes. \
 \
The Python library can be used to communicate with EOS either locally \
(on-box) or remotely (off-box). It uses a standard INI-style configuration file \
to specify one or more nodes and connection profiles. \
 \
The pyeapi library also provides an API layer for building native Python \
objects to interact with the destination nodes. The API layer is a convenient \
implementation for working with the EOS configuration and is extensible for \
developing custom implementations."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "python310-pyeapi-0.8.4-3.6.noarch.rpm"
RPM_HASH = "ca1839cb744b2521ff784f6340f2e8dd4001481c0c9581e575fc7004a37f3fb4072286b4eafd0b6abcf20fc6c9381e579351ca333e12d7c5cba55aa012e97016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyeapi python3.10dist(pyeapi) python310-pyeapi python3dist(pyeapi)"
RDEPENDS:${PN} += "python(abi) python310-netaddr"

inherit rpm
