SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.3.5"

RPM_NAME = "python311-rich-13.3.5-1.1.noarch.rpm"
RPM_HASH = "ecef3ab74b019d1eb0b40d837952bd9c14b854d673fe6774fc8c4bf5f8a84e7c272fea5d4f11de4756d29f7e7e85861848c17ec1a32d2fb295f4fda5bc981064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rich) python311-rich python3dist(rich)"
RDEPENDS:${PN} += "python(abi) python311-markdown-it-py python311-pygments"

inherit rpm
