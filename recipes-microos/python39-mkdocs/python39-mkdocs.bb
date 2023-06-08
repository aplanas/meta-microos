SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "python39-mkdocs-1.4.2-1.2.noarch.rpm"
RPM_HASH = "a2fc128479a2bf18e5d5f533476761c3e1919e4b142e36b12499b245f3059e3b9eda40397231897dd826dc0a418226f8dd9e54d3cd3b297282bc5c8f17b5881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mkdocs) python39-mkdocs python3dist(mkdocs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 fontawesome-fonts fontawesome-fonts-web python(abi) python39-Jinja2 python39-Markdown python39-MarkupSafe python39-PyYAML python39-click python39-ghp-import python39-importlib_metadata python39-mergedeep python39-packaging python39-pyyaml_env_tag python39-watchdog update-alternatives"

inherit rpm
