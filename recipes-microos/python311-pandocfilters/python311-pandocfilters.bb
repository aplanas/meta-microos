SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-pandocfilters-1.5.0-1.4.noarch.rpm"
RPM_HASH = "e68a07c40f9cd6a8580160f6b26b0705ffedd091866a32161986168ade827f8d79ce9439c0baba88a5310d5d28d5eee137b2d914a1bacf34f2f7ccda6003352a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pandocfilters) \
python311-pandocfilters \
python3dist(pandocfilters)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
