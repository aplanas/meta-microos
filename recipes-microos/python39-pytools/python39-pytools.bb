SUMMARY = "A collection of tools for Python"
DESCRIPTION = "Pytools is a big bag of things that are 'missing' from the Python standard library. \
This is mainly a dependency of other software packages (pycuda, pyopencl, etc ), \
and is probably of little interest to you unless you use those. If you're curious \
nonetheless, here's what's on offer: \
* A ton of small tool functions such as len_iterable, argmin, tuple generation, \
  permutation generation, ASCII table pretty printing, GvR's mokeypatch_xxx() hack, \
  the elusive flatten, and much more. \
* Michele Simionato's decorator module \
* A time-series logging module, pytools.log. \
* Batch job submission, pytools.batchjob. \
* A lexer, pytools.lex."
LICENSE = "MIT"

PV = "2022.1.14"

RPM_NAME = "python39-pytools-2022.1.14-1.2.noarch.rpm"
RPM_HASH = "d5c4898de6ece91244f67964a851e3b6f8be258a617578fe8ab9fdce97e2a01b5030db69f6d17f85e5cac3ac93c96820a4c783123d06ac1c11c7e64e267225f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytools) python39-pytools python3dist(pytools)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-platformdirs python39-typing_extensions"

inherit rpm
