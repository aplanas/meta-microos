SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python311-pypandoc-1.6.4-3.5.aarch64.rpm"
RPM_HASH = "24ead11e1003aca47b29b670522f4c39e5f78fe8e9bb4e398e29deeca0a91c217d92b1186567188970fc5453306ef8bb2d3effebc573e84ed23e3ba54dbe475a"

RPROVIDES:${PN} += "python3.11dist(pypandoc) python311-pypandoc python311-pypandoc(aarch-64) python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc python(abi) python311-pip python311-wheel"

inherit rpm
