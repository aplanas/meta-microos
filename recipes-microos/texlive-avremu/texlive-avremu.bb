SUMMARY = "An 8-Bit Microcontroller Simulator written in LaTeX"
DESCRIPTION = "A fully working package to simulate a Microprocessor in pure \
LaTeX. The simulator is able to calculate complex pictures, \
like Mandelbrot sets."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn35373"

RPM_NAME = "texlive-avremu-2023.201.0.0.1svn35373-53.1.noarch.rpm"
RPM_HASH = "8facea4a8c37c1bb7e9707bbd3b0678090618acde7741bcbb7256b7b523458dbdc0235b56f6b7f4af71f0c2afe49ac7f4ad5902c135382f107c67bb11fd43e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(avr.binary.tex) tex(avr.bitops.tex) tex(avr.draw.tex) tex(avr.instr.tex) tex(avr.io.tex) tex(avr.memory.tex) tex(avr.numbers.tex) tex(avr.testsuite.tex) tex(avremu.sty) texlive-avremu"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(kvoptions.sty) tex(tabularx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
