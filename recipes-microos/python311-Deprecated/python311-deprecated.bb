SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.14"

RPM_NAME = "python311-Deprecated-1.2.14-1.1.noarch.rpm"
RPM_HASH = "1ab571d529289aa974b5a08844a8de2ec3369fc412b08a35044fc3de370ca7287500e924b63ea1bf092f5c973d9fbdee66d736a90953dcbefe9c697b2fb369b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(deprecated) python311-Deprecated python311-deprecated python3dist(deprecated)"
RDEPENDS:${PN} += "python(abi) python311-wrapt"

inherit rpm
