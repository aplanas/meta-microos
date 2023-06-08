SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.13"

RPM_NAME = "python39-Deprecated-1.2.13-3.1.noarch.rpm"
RPM_HASH = "3a8cba7f876b74ddfe507910bd676612f5a231d6dcce89d767fac9f7063fb6054e6265f0789655f19cbd7ba159eac8a19c0ecc89773e4cbc8c7f4f86c066ad49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(deprecated) python39-Deprecated python39-deprecated python3dist(deprecated)"
RDEPENDS:${PN} += "python(abi) python39-wrapt"

inherit rpm
