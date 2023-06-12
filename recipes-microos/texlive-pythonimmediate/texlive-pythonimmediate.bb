SUMMARY = "Library to run Python code"
DESCRIPTION = "Just like PerlTeX or PyLuaTeX (and unlike PythonTeX or \
lt3luabridge), this only requires a single run, and variables \
are persistent throughout the run. Unlike PerlTeX or PyLuaTeX, \
there is no restriction on compiler or script required to run \
the code. There are also debugging functionalities: TeX errors \
result in Python traceback, and Python errors result in TeX \
traceback. Errors in code executed with the pycode environment \
give the correct traceback point to the Python line of code in \
the TeX file. For advanced users, this package allows the user \
to manipulate the TeX state directly from within Python, so you \
don't need to write a single line of TeX code. CAUTION: In \
addition to this LaTeX package you need the Python \
pythonimmediate-tex package, which can be obtained from \
https://pypi.org/project/pythonimmediate-tex/."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-2023.201.0.0.4.0svn66461-53.1.noarch.rpm"
RPM_HASH = "d7957e9efe10a99a9e816ca6db3053acdf5cfd011be775c235e7691db1f4d78b9d21faa339627aea64b0606d7eb2fc16aa51e9f8a6b1b73b20a510b9435038e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pythonimmediate.sty) \
texlive-pythonimmediate"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(currfile.sty) \
tex(l3keys2e.sty) \
tex(precattl.sty) \
tex(saveenv.sty) \
texlive \
texlive-currfile \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-precattl \
texlive-saveenv \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
