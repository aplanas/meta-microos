SUMMARY = "Specifications for callback functions passed in to an API"
DESCRIPTION = "If code lets other people supply callback functions, it is important \
to specify the function signature that is being expected, and to \
check that functions support that. Adding extra parameters later \
would break other peoples code unless one is careful. \
backcall provides a way of specifying the callback signature using a \
prototype function."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-backcall-0.2.0-2.1.noarch.rpm"
RPM_HASH = "fd140203231e2cdc6948de5cb0d82baee8e4d12637ffd5cb10a2f4d2387480333bcc37486eccd20aefcd46bdee534d1ec830423d387a85fcfe1363f27a65b484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(backcall) python39-backcall python3dist(backcall)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
