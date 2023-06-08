SUMMARY = "Bundle together all the files needed to build a LaTeX document"
DESCRIPTION = "The bundledoc package is a post-processor for the snapshot \
package that bundles together all the classes, packages and \
files needed to build a given LaTeX document. It reads the .dep \
file that snapshot produces, finds each of the files mentioned \
therein, and archives them into a single .tar.gz (or .zip, or \
whatever) file, suitable for moving across systems, \
transmitting to a colleague, etc. A script, arlatex, provides \
an alternative 'archiving' mechanism, creating a single LaTeX \
file that contains all of the ancillary files of a LaTeX \
document, together with the document itself, using the \
filecontents* environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn64620"

RPM_NAME = "texlive-bundledoc-2023.201.3.4svn64620-52.1.noarch.rpm"
RPM_HASH = "7d1cf28a52edb09c75ea5eac63c152eacf9e1b758e48fb0fa2b2ed05196c51b46e61a6fafb810539641b6182fa30472224ccba5fdfdc40eebe5b31cc16a0c812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(miktex.cfg) tex(texlive-unix-arlatex.cfg) tex(texlive-unix.cfg) texlive-bundledoc"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(File::Basename) perl(File::Copy) perl(File::Find) perl(File::Path) perl(File::Spec) perl(File::Spec::Functions) perl(File::Temp) perl(Getopt::Long) perl(Pod::Usage) perl(strict) perl(warnings) sed texlive texlive-bundledoc-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
