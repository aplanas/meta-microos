SUMMARY = "A tool for creating document structures based on templates"
DESCRIPTION = "TeXplate is a tool for creating document structures based on \
templates. The application name is a word play on TeX and \
template, so the purpose seems quite obvious: we want to \
provide an easy and straightforward framework for reducing the \
typical code boilerplate when writing TeX documents. Also note \
that one can easily extrapolate the use beyond articles and \
theses: the application is powerful enough to generate any \
text-based structure, given that a corresponding template \
exists."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.4svn61719"

RPM_NAME = "texlive-texplate-2023.201.1.0.4svn61719-54.1.noarch.rpm"
RPM_HASH = "1286a248eace47001e4c91a7691ba54471463de827c0eab5c14108a1556b4b4153d62afd42e2f36050edd1cc77b617690e9698c5b510c26291954479234f8068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texplate.jar) \
texlive-texplate"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texplate-bin"

inherit rpm
