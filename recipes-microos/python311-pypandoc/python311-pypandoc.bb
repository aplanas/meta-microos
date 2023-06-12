SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python311-pypandoc-1.11-1.1.noarch.rpm"
RPM_HASH = "e280a2642a428ffdd582a51f5dab70bf4f6b1066bb5ca1051abd8def6466bfadc066d817b3139f49ee5f04b1bdde888ee38bbca104632b64b8c850f362053914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypandoc) python311-pypandoc python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc python(abi) python311-pip python311-wheel"

inherit rpm
