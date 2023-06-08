SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python39-pypandoc-1.6.4-3.5.aarch64.rpm"
RPM_HASH = "e757a9cfaaff2a97c7e3a7afd3c929b36452c8d430ba8d1b2a87f25dfaece9d2ca7f726b44b15cd5d7f94ac39139373e935dbf4678f0578699c43cd951ecd392"

RPROVIDES:${PN} += "python3.9dist(pypandoc) python39-pypandoc python39-pypandoc(aarch-64) python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc python(abi) python39-pip python39-wheel"

inherit rpm
