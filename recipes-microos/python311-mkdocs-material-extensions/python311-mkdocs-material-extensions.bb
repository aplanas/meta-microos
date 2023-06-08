SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-mkdocs-material-extensions-1.1.1-2.1.noarch.rpm"
RPM_HASH = "7b6acfcf7ec5a3a2b1de69afd174e9b6de3abdd794c1c923991f49c9ca053dd7597ef20bed69d4c8a9b37e5aa0c2329a35d833d290d42f80f63ff2099520f4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mkdocs-material-extensions) python311-mkdocs-material-extensions python3dist(mkdocs-material-extensions)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
