SUMMARY = "Computation of gcd of integers inside LaTeX using Lua"
DESCRIPTION = "Using Lua, the luagcd package is developped to find the \
greatest common divisor (gcd) of integers in LaTeX. The package \
provides commands to obtain step-by-step computation of gcd of \
two integers by using the Euclidean algorithm. In addition, the \
package has the command to express gcd of two integers as a \
linear combination. The Bezout's Identity can be verified for \
any two integers using commands in the package. No particular \
environment is required for the use of commands in the package. \
It is written in Lua, and the TeX file has to be compiled with \
the LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65396"

RPM_NAME = "texlive-luagcd-2023.201.1.0svn65396-52.1.noarch.rpm"
RPM_HASH = "e9ec6548f777caa807cd77c863137bf2948050f9b97622e4fbbad3136dfbfa28b7be0252b1347cb8d78285e6830757d9bf7805c54665fc81081c7516354d906b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luagcd.sty) texlive-luagcd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(luacode.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
