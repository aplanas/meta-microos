SUMMARY = "System InformaTion at Runtime"
DESCRIPTION = "Sitar prepares system information using perl and binary tools, and by \
reading the /proc file system. Output is in HTML, LaTeX and (docbook) \
XML, and can be converted to PS and PDF. \
 \
This program must be run as 'root'. \
 \
sitar.pl includes scsiinfo by Eric Youngdale, Michael Weller \
<eowmob@exp-math.uni-essen.de> and ide_info by David A. Hinds \
<dhinds@hyper.stanford.edu>. \
 \
The accompanying tool 'cfg2scm' is supplied for checking configuration \
changes into SCMs (like SVN, CVS, ...) or creating a tar-file with all \
relevant files. \
 \
Comment: Sitar is an ancient Indian instrument as well. \
 \
 \
 \
Authors: \
-------- \
    Matthias Eckermann  <mge@suse.de> \
    and contributors"
LICENSE = "GPL-2.0+"

PV = "1.0.6"

RPM_NAME = "sitar-1.0.6-154.15.noarch.rpm"
RPM_HASH = "f273a1b6db3e1845f3b48c403939f761a3c6bca0cd1641787a0f9fdc9cf8492a116348f77dfac313f82107e12b82daf8a35297b9f202b3bd4d861b83b9e3f350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sitar"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup"

inherit rpm
