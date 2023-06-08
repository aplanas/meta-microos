SUMMARY = "ConTeXt and packages"
DESCRIPTION = "Hans Hagen's powerful ConTeXt system, http://pragma-ade.com. \
Also includes third-party ConTeXt packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66171"

RPM_NAME = "texlive-collection-context-2023.201.svn66171-56.1.noarch.rpm"
RPM_HASH = "ec5f4ccf059971e5007ecc2bc03e089544e57c1d43eba5990e47ab1633ba4737f9f1be71abf648d022774aca3ece1a224e6717beb4fbde48971829ac797fcf1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-context"
RDEPENDS:${PN} += "texlive-collection-basic texlive-context texlive-context-account texlive-context-algorithmic texlive-context-animation texlive-context-annotation texlive-context-bnf texlive-context-chromato texlive-context-cmscbf texlive-context-cmttbf texlive-context-construction-plan texlive-context-cyrillicnumbers texlive-context-degrade texlive-context-fancybreak texlive-context-filter texlive-context-french texlive-context-fullpage texlive-context-gantt texlive-context-gnuplot texlive-context-handlecsv texlive-context-layout texlive-context-letter texlive-context-lettrine texlive-context-mathsets texlive-context-rst texlive-context-ruby texlive-context-simplefonts texlive-context-simpleslides texlive-context-title texlive-context-transliterator texlive-context-typearea texlive-context-typescripts texlive-context-vim texlive-context-visualcounter texlive-jmn"

inherit rpm
