SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python310-EditorConfig-0.12.3+git.1630438300.f43312a-1.10.noarch.rpm"
RPM_HASH = "c8ca6896f4454fdb4e1c301e336a8c8813a3b2c2b15f3c6ce61712026288e0213f408aea08dab954effd0bb010e1fde91b5d9197bb46c2230e6a1bca5d97bc2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EditorConfig python3.10dist(editorconfig) python310-EditorConfig python3dist(editorconfig)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
