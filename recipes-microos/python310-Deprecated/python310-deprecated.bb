SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.13"

RPM_NAME = "python310-Deprecated-1.2.13-3.1.noarch.rpm"
RPM_HASH = "4b2fd761c857dd6a9d6d59fdbbcf83a8c7c3b6a0d31e71b081b17dae2afa24188f33ebbf6302c1e5bc577dd54ce2b5290f935f93b9c3c8e4c95ab6ad35af77eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Deprecated python3-deprecated python3.10dist(deprecated) python310-Deprecated python310-deprecated python3dist(deprecated)"
RDEPENDS:${PN} += "python(abi) python310-wrapt"

inherit rpm
