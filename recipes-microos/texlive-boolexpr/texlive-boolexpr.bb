SUMMARY = "A boolean expression evaluator and a switch command"
DESCRIPTION = "The \\boolexpr macro evaluates boolean expressions in a purely \
expandable way. \\boolexpr{ A \\OR B \\AND C } expands to 0 if the \
logical expression is TRUE. A, B, C may be: numeric expressions \
such as: x=y, x<>y, x>y or x<y; - boolean switches: \\iftrue \
0\\else 1\\fi; - conditionals: \\ifcsname whatsit\\endcsname 0\\else \
1\\fi; - another \\boolexpr: \\boolexpr{ D \\OR E \\AND F }: \
\\boolexpr may be used with \\ifcase: \\ifcase\\boolexpr{ A \\OR B \
\\AND C } What to do if true \\else What to do if false \\fi The \
\\switch command (which is also expandable) has the form: \
\\switch \\case{<boolean expression>} ... \\case{<boolean \
expression>} ... ... \\otherwise ... \\endswitch"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.14svn17830"

RPM_NAME = "texlive-boolexpr-2023.201.3.14svn17830-52.1.noarch.rpm"
RPM_HASH = "caf1d16d0aeed106f52c0d9bb4ef7c515bf4f6c0657ed99c5c7d85eca2d84d5f5beb78d3cfecc55339ec722c4f3c3181fdd5f80a3c17606724f0cd4fa495f584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(boolexpr.sty) texlive-boolexpr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
