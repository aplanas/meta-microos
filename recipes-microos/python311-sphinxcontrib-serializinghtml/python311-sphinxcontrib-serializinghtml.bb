SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python311-sphinxcontrib-serializinghtml-1.1.5-2.1.noarch.rpm"
RPM_HASH = "222e39e88bdc8eb35e9068bcba2d204e94e37bfe0a954a5290001a584cb1d1bf6d159ef97f751b123b1d8ac3d8cf69206f6c132cc0082ff04e37b584d4106785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-serializinghtml) python311-sphinxcontrib-serializinghtml python3dist(sphinxcontrib-serializinghtml)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
