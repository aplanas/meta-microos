SUMMARY = "A LaTeX class for fulfilling the documentation duties according to the German minimum wage law MiLoG"
DESCRIPTION = "Seit dem 1. Januar 2015 gilt in Deutschland grundsatzlich fur \
alle Arbeitnehmer ein flachendeckender gesetzlicher Mindestlohn \
in Hohe von derzeit 8,50EUR pro Stunde. Mit Wirkung ab 1. \
August 2015 wurden die Dokumentations- und \
Aufzeichnungspflichten gelockert. Nach SS17 MiLoG, muss Beginn, \
Ende und Dauer der taglichen Arbeitszeit der in SS22 MiLoG \
definierten Arbeitnehmern (formlos) aufgezeichnet werden. \
Zusatzlich ermoglicht milog.cls aus praktischen Grunden die \
Aufzeichnug von unbezahlten Pausen und Bemerkungen (Ruhetag, \
Urlaub, krank, ...). Die Erfassung der Arbeitszeiten erfolgt in \
einer simplen CSV-Datei, aus der die Klasse automatisch einen \
Arbeitszeitnachweis erstellt. Alternativ konnen die Daten auch \
durch einen CSV-Export - mit eventueller Nachbearbeitung - \
einer geeigneteten App erhoben werden. The milog.cls class \
provides means to fulfill the documentation duties by the \
German minimum wage law MiLoG. The recording of working hours \
is carried out in a simple CSV file from which the class will \
automatically create a time sheet. Alternatively, data can also \
be collected by a CSV export of a suitable app."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41610"

RPM_NAME = "texlive-milog-2023.201.1.0svn41610-54.1.noarch.rpm"
RPM_HASH = "2b6f82729d5ab035c30110775aa3501bfa7336ef141bc907ed0ce986772324cfe7365b72c7da9fd8b796bb6f48b8d4c89af32ad1314bf59548cabcc570b9549e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(milog.cls) texlive-milog"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(background.sty) tex(booktabs.sty) tex(colortbl.sty) tex(geometry.sty) tex(pgfplotstable.sty) tex(tabularx.sty) tex(transparent.sty) tex(xifthen.sty) tex(xkeyval.sty) tex(xkvltxp.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
