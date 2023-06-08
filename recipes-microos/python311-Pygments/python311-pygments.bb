SUMMARY = "A syntax highlighting package written in Python"
DESCRIPTION = "Pygments is a generic syntax highlighter for general use in all kinds of software \
such as forum systems, wikis or other applications that need to prettify \
source code. Highlights are: \
 \
 * a wide range of common languages and markup formats is supported \
 * support for new languages and formats can be added \
 * a number of output formats, presently HTML, LaTeX, RTF, SVG, all image \
   formats that PIL supports and ANSI sequences \
 * it is usable as a command-line tool and as a library \
 * highlights Brainfuck"
LICENSE = "BSD-2-Clause"

PV = "2.15.1"

RPM_NAME = "python311-Pygments-2.15.1-2.1.noarch.rpm"
RPM_HASH = "e6bce2ef6605491bc89145d6e4d76c7fc6a3e1ae85fb36e634933f53c4a475b7bf1587134b15fa1bb165d7fe1779e61473f6400bd498755b722b7d6df4f9144e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygments) python311-Pygments python311-pygments python3dist(pygments)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi)"

inherit rpm
