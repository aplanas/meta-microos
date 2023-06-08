SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python311-myst-parser-0.17.2-2.10.noarch.rpm"
RPM_HASH = "4f135eeceeb1c86d18e183e6993cac3b56145cecf79ed360fe863330a4df2139af0823fa35f89f736ef6ba35651b881ea7c71711c795536eb820988b7fecd135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(myst-parser) python311-myst-parser python3dist(myst-parser)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-PyYAML python311-Sphinx python311-docutils python311-markdown-it-py python311-mdit-py-plugins python311-typing-extensions update-alternatives"

inherit rpm
