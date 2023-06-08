SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python39-mistune-2.0.5-1.1.noarch.rpm"
RPM_HASH = "978ddc89b314bcf960dee63289a45d2694aa1bd5e871b4a36e81a6d26ae0d41b9be262a25bc1f2aee30d2b7d16986327129a31a2ca703d70bfbca34c38862a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mistune) python39-mistune python3dist(mistune)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
