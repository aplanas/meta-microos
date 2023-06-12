SUMMARY = "ConTeXt and packages"
DESCRIPTION = "Hans Hagen's powerful ConTeXt system, http://pragma-ade.com. \
Also includes third-party ConTeXt packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66171"

RPM_NAME = "texlive-collection-context-2023.208.svn66171-58.1.noarch.rpm"
RPM_HASH = "0dfe7f5c43774def0feed47f010e562bfc5056626f1ed28594ddfc157c6364641bfffb7d223604c004d0f46baa3ceda45b911b6572c7f8cebcfa37558013c292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-context"
RDEPENDS:${PN} += "texlive-collection-basic texlive-context texlive-context-account texlive-context-algorithmic texlive-context-animation texlive-context-annotation texlive-context-bnf texlive-context-chromato texlive-context-cmscbf texlive-context-cmttbf texlive-context-construction-plan texlive-context-cyrillicnumbers texlive-context-degrade texlive-context-fancybreak texlive-context-filter texlive-context-french texlive-context-fullpage texlive-context-gantt texlive-context-gnuplot texlive-context-handlecsv texlive-context-layout texlive-context-letter texlive-context-lettrine texlive-context-mathsets texlive-context-rst texlive-context-ruby texlive-context-simplefonts texlive-context-simpleslides texlive-context-title texlive-context-transliterator texlive-context-typearea texlive-context-typescripts texlive-context-vim texlive-context-visualcounter texlive-jmn"

inherit rpm
