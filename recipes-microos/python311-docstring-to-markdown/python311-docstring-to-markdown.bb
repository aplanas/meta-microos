SUMMARY = "On the fly conversion of Python docstrings to markdown"
DESCRIPTION = "On the fly conversion of Python docstrings to markdown \
  - Python 3.6+ \
  - currently can recognise reStructuredText and convert \
    multiple of its features to Markdown \
  - in the future will be able to convert Google docstrings too"
LICENSE = "LGPL-2.1-only"

PV = "0.12"

RPM_NAME = "python311-docstring-to-markdown-0.12-1.2.noarch.rpm"
RPM_HASH = "de3a252d49ed53fe22a7b6d16f3af596b611402bd3aeb313a6986d6036959dd67cc464e3e4e654d1767d4f2a0bef07be4ed6181d05bef2cda37cff62b5020184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docstring-to-markdown) python311-docstring-to-markdown python311-docstring_to_markdown python3dist(docstring-to-markdown)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
