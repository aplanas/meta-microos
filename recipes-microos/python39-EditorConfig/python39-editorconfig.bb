SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.3+git.1630438300.f43312a"

RPM_NAME = "python39-EditorConfig-0.12.3+git.1630438300.f43312a-1.10.noarch.rpm"
RPM_HASH = "6a5d159b1f0b73df6e22ce3eae9ca2ef6b9cd5b9aae4f9a917e25fbfd495796af1e7e9c842b2d99a0b34a173f534e5111bd5541bbabc5ea2bf8c3ec7c38ed7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(editorconfig) python39-EditorConfig python3dist(editorconfig)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
