	/* Data SHA1: 1b57865ee6cffd887f8b2d8b46a1b7b77a5da061 */
	.file	"typemap.mj.inc"

	/* Mapping header */
	.section	.data.mj_typemap,"aw",@progbits
	.type	mj_typemap_header, @object
	.p2align	2
	.global	mj_typemap_header
mj_typemap_header:
	/* version */
	.long	1
	/* entry-count */
	.long	51
	/* entry-length */
	.long	189
	/* value-offset */
	.long	100
	.size	mj_typemap_header, 16

	/* Mapping data */
	.type	mj_typemap, @object
	.global	mj_typemap
mj_typemap:
	.size	mj_typemap, 9640
	.include	"typemap.mj.inc"
