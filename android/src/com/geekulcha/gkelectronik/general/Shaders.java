/*==============================================================================
 Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc.
 All Rights Reserved.
 ==============================================================================*/

package com.geekulcha.gkelectronik.general;

public class Shaders 
{
	
	public static final String cubeMeshVertexShader =
	"attribute vec4 vertexPosition; " +
	"attribute vec4 vertexNormal; " +
	"attribute vec2 vertexTexCoord; " +
	" " +
	"varying vec2 texCoord; " +
	"varying vec4 normal; " +
	" " +
	"uniform mat4 modelViewProjectionMatrix; " +
	" " +
	"void main() " +
	"{ " +
	"   gl_Position = modelViewProjectionMatrix * vertexPosition; " +
	"   normal = vertexNormal; " +
	"   texCoord = vertexTexCoord; " +
	"} ";

	public static final String cubeFragmentShader =
	"precision mediump float; " +
	" " +
	"varying vec2 texCoord; " +
	"varying vec4 normal; " +
	" " +
	"uniform sampler2D texSampler2D; " +
	" " +
	"void main() " +
	"{ " +
	"   gl_FragColor = texture2D(texSampler2D, texCoord); " +
	"} ";
}
