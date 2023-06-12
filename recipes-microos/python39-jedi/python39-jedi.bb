SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Jedi is a static analysis tool for Python that can be used in \
IDEs/editors. Its focus is autocompletion and static \
analysis. \
 \
Jedi has support for two different goto functions. It's possible to \
search for related names and to list all names in a Python file and \
infer them. Jedi understands docstrings and you can use Jedi \
autocompletion in your REPL as well. \
 \
Jedi uses an API to connect with IDEs. There is a reference \
implementation as a VIM plugin which uses Jedi's autocompletion."
LICENSE = "MIT & Python-2.0"

PV = "0.18.2"

RPM_NAME = "python39-jedi-0.18.2-6.1.noarch.rpm"
RPM_HASH = "ef787d95ed80348934905ccbb7a4e4056d5a32ba84dc95241362b79d3ad5904d888373807dcd57b7de169559f0d2d114e4fd0707b27924fb9c509a64f9d034be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jedi) \
python39-jedi \
python3dist(jedi)"
RDEPENDS:${PN} += "(python39-parso >= 0.8.0 with python39-parso < 0.9) \
python(abi)"

inherit rpm
